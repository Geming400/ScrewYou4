package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.AngerLevel.class)
public class AngerLevel489850319Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void values__159794313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159794313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void valueOf_745519668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745519668L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.ANGRY);
    }

    @Inject(at = @At("HEAD"), method = "getMinimumAnger()I", cancellable = true)
    private void getMinimumAnger_528112565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528112565L))
            info.setReturnValue(436822766);
    }

    @Inject(at = @At("HEAD"), method = "getListeningSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getListeningSound_1580063217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580063217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byAnger(I)Lnet/minecraft/world/entity/monster/warden/AngerLevel;", cancellable = true)
    private static void byAnger_1026743589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026743589L))
            info.setReturnValue(net.minecraft.world.entity.monster.warden.AngerLevel.ANGRY);
    }

    @Inject(at = @At("HEAD"), method = "isAngry()Z", cancellable = true)
    private void isAngry_528128902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528128902L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound_1580063217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580063217L))
            info.setReturnValue(null);
    }


}
