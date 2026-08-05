package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.FillBiomeCommand.class)
public class FillBiomeCommand1412550874Mixin {
        @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void fill_1151212423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151212423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void fill_1392343366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392343366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__674806703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-674806703L))
            info.cancel();
    }


}
