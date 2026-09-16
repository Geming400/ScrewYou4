package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Entry.class)
public class Entry_167231865Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/world/entity/EquipmentSlotGroup;", cancellable = true)
    private void slot_720529136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720529136L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlotGroup.CHEST);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__741394404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741394404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_937655389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937655389L))
            info.setReturnValue("\u1765z(|Bmw_qY)b{{0`}j{\u2FF274>F?X\u0FA6%?M=,}`3,\uB54Aqj\u38A0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_724583955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724583955L))
            info.setReturnValue(-1334686823);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void matches_661383097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661383097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display;", cancellable = true)
    private void display__1925924340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925924340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void modifier__2090776234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090776234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_343128920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343128920L))
            info.setReturnValue(null);
    }


}
