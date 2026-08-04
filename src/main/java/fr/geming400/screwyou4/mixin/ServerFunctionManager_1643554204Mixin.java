package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerFunctionManager.class)
public class ServerFunctionManager_1643554204Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get_1309662657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309662657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/functions/CommandFunction;Lnet/minecraft/commands/CommandSourceStack;)V", cancellable = true)
    private void execute__1762700035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762700035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1681828942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1681828942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getTag_2054444611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054444611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceLibrary(Lnet/minecraft/server/ServerFunctionLibrary;)V", cancellable = true)
    private void replaceLibrary__84200875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-84200875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDispatcher()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getDispatcher_438504848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438504848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameLoopSender()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void getGameLoopSender__641890102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641890102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunctionNames()Ljava/lang/Iterable;", cancellable = true)
    private void getFunctionNames__366195485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366195485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTagNames()Ljava/lang/Iterable;", cancellable = true)
    private void getTagNames__366195485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366195485L))
            info.setReturnValue(null);
    }


}
