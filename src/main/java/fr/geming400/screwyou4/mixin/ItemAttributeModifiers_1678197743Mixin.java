package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.class)
public class ItemAttributeModifiers_1678197743Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/List;", cancellable = true)
    private void modifiers__903711590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903711590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_769571474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769571474L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1846346029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846346029L))
            info.setReturnValue("g&&\u0A87\u6639|dTk:B+\u447A4\uD794)U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2059417463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059417463L))
            info.setReturnValue(-955296805);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private static void builder_783812360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783812360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/core/Holder;DLnet/minecraft/world/entity/EquipmentSlot;)D", cancellable = true)
    private void compute_1058489147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058489147L))
            info.setReturnValue(6.570344000764817E8D);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlotGroup;Lorg/apache/commons/lang3/function/TriConsumer;)V", cancellable = true)
    private void forEach__559031564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-559031564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach_698085168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(698085168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlotGroup;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach_1289456945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289456945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withModifierAdded(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void withModifierAdded_784911089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784911089L))
            info.setReturnValue(null);
    }


}
