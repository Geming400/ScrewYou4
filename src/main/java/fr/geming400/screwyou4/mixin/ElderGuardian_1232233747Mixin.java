package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.ElderGuardian.class)
public class ElderGuardian_1232233747Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1687631560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687631560L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getAttackDuration()I", cancellable = true)
    private void getAttackDuration_49208646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49208646L))
            info.setReturnValue(1601390427);
    }


}
