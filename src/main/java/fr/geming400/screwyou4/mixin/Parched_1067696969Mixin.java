package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Parched.class)
public class Parched_1067696969Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_367478523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367478523L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected_1223569045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223569045L))
            info.setReturnValue(true);
    }


}
