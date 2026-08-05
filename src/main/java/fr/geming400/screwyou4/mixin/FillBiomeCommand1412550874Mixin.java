package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.FillBiomeCommand.class)
public class FillBiomeCommand1412550874Mixin {
        @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void fill__1960748189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960748189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void fill_366320522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366320522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__165258482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-165258482L))
            info.cancel();
    }


}
