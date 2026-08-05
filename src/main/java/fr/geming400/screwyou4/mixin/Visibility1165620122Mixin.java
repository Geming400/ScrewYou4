package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.Visibility.class)
public class Visibility1165620122Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void values_953910171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953910171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void valueOf__1309569986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309569986L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.HIDDEN);
    }

    @Inject(at = @At("HEAD"), method = "isAccessible()Z", cancellable = true)
    private void isAccessible_1203898705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203898705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTicking()Z", cancellable = true)
    private void isTicking_1203898705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203898705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fromFullChunkStatus(Lnet/minecraft/server/level/FullChunkStatus;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void fromFullChunkStatus_16972598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16972598L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TRACKED);
    }


}
