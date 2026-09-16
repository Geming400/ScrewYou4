package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Evoker.class)
public class Evoker1390061842Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1529803464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529803464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1291498122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291498122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_417589695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(417589695L))
            info.cancel();
    }


}
