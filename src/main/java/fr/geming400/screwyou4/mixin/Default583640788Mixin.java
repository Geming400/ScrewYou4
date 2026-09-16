package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Default.class)
public class Default583640788Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type_1469731660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469731660L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__324985480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324985480L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1354064313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354064313L))
            info.setReturnValue("*f]]g<q\u4440B|,P\u8F2Axim\u9ACBch\uB715vn*6sPJA0KC+\u56F2@'Au5fx[',r47$12DUF4\u9908<{eTF|z\uAA74\u5AEF\uACD5r#%YD.{0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1140992879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140992879L))
            info.setReturnValue(216833177);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply__833417557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-833417557L))
            info.cancel();
    }


}
