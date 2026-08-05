package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.OverrideText.class)
public class OverrideText_1956518858Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type_1925582855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925582855L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.OVERRIDE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__952936180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-952936180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_821058882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821058882L))
            info.setReturnValue("BA7?opKH9%GVM=}(NryBS72驇㚁}\"[xz넜춰MD㸡{k钱8z;'0>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1994781599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994781599L))
            info.setReturnValue(1498395025);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply_473877966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(473877966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void component__220390308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220390308L))
            info.setReturnValue(null);
    }


}
