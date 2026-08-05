package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Builder.class)
public class Builder_1922615264Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private void add_1534010356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534010356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private void add_130717709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130717709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void build_1596088069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596088069L))
            info.setReturnValue(null);
    }


}
