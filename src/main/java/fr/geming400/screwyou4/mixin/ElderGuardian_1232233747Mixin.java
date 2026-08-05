package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.ElderGuardian.class)
public class ElderGuardian_1232233747Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_532015301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532015301L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getAttackDuration()I", cancellable = true)
    private void getAttackDuration_1270495992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270495992L))
            info.setReturnValue(-2136083827);
    }


}
