package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Evoker.class)
public class Evoker1390061842Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_689843397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689843397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1814692556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814692556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__1665941497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665941497L))
            info.cancel();
    }


}
