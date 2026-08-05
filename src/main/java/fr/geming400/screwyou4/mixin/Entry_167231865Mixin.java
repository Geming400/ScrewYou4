package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Entry.class)
public class Entry_167231865Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private void slot__1814182482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814182482L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.ARMOR);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1552744123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552744123L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__968228111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968228111L))
            info.setReturnValue("\uD5239j:\u291AK3Vh\u802C0o*Sv6@eD)Snt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_205494606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205494606L))
            info.setReturnValue(-1670324378);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void matches_1799505926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799505926L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display;", cancellable = true)
    private void display__18366194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18366194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void modifier_1565752959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565752959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_1716107636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716107636L))
            info.setReturnValue(null);
    }


}
