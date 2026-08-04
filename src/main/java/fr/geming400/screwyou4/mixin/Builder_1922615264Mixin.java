package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Builder.class)
public class Builder_1922615264Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private void add__635490989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635490989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private void add__1130124530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130124530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void build_1433353011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433353011L))
            info.setReturnValue(null);
    }


}
