package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.class)
public class ItemAttributeModifiers_1678197743Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/List;", cancellable = true)
    private void modifiers__990432738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990432738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1231257295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231257295L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_542737767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542737767L))
            info.setReturnValue("␒+>_d]V{IE0nᛜ^ᣱ䭑듄<osw9OR{1/[-N_wk扥:P,ಈ:`s⺽㕆WO[ $}f1콷∖2(9)q0U좤霒^]gw4AmJ*H.r녚Krh}@)F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1716460484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716460484L))
            info.setReturnValue(-1862312092);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;", cancellable = true)
    private static void builder_1942180611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942180611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/core/Holder;DLnet/minecraft/world/entity/EquipmentSlot;)D", cancellable = true)
    private void compute_1527319506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527319506L))
            info.setReturnValue(1.547320004434264E8D);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlotGroup;Lorg/apache/commons/lang3/function/TriConsumer;)V", cancellable = true)
    private void forEach__828192354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-828192354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach__1291851194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1291851194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/EquipmentSlotGroup;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach__1622732837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1622732837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withModifierAdded(Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;Lnet/minecraft/world/entity/EquipmentSlotGroup;)Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private void withModifierAdded_190037588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190037588L))
            info.setReturnValue(null);
    }


}
