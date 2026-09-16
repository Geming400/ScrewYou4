package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerFunctionManager.class)
public class ServerFunctionManager_1643554204Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get_1186781207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186781207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/functions/CommandFunction;Lnet/minecraft/commands/CommandSourceStack;)V", cancellable = true)
    private void execute__382859470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-382859470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1513870545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513870545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getTag_1774209703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774209703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameLoopSender()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void getGameLoopSender__1948734935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948734935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionNames()Ljava/lang/Iterable;", cancellable = true)
    private void getFunctionNames_1231582589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231582589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTagNames()Ljava/lang/Iterable;", cancellable = true)
    private void getTagNames__1448290777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448290777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceLibrary(Lnet/minecraft/server/ServerFunctionLibrary;)V", cancellable = true)
    private void replaceLibrary__1859743282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1859743282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getDispatcher__448649043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448649043L))
            info.setReturnValue(new com.mojang.brigadier.CommandDispatcher());
    }


}
