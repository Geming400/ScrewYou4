package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.OverrideText.class)
public class OverrideText_1956518858Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type__1452357567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452357567L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.OVERRIDE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1047892589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047892589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1568024914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568024914L))
            info.setReturnValue("2YUikN\u6012jrw?Pp\u4D8D2wU'Gc@g,`Wmf:3\u2CBC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1781096348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781096348L))
            info.setReturnValue(981837015);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply_539460512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539460512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void component_913550617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913550617L))
            info.setReturnValue(null);
    }


}
