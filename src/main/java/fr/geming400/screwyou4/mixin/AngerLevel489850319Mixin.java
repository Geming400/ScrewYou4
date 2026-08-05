package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.AngerLevel.class)
public class AngerLevel489850319Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void values_1957626133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957626133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void valueOf_285016412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285016412L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.ANGRY);
    }

    @Inject(at = @At("HEAD"), method = "byAnger(I)Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void byAnger_1147751733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147751733L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.ANGRY);
    }

    @Inject(at = @At("HEAD"), method = "getMinimumAnger()I", cancellable = true)
    private void getMinimumAnger_812943878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812943878L))
            info.setReturnValue(-1142046714);
    }

    @Inject(at = @At("HEAD"), method = "getListeningSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getListeningSound__1944504793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944504793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAngry()Z", cancellable = true)
    private void isAngry_247135055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247135055L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound__1235071420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235071420L))
            info.setReturnValue(null);
    }


}
