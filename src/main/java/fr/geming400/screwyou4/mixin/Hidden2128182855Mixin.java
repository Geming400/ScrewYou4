package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Hidden.class)
public class Hidden2128182855Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type_2097246853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097246853L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.HIDDEN);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__781272182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781272182L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_992722880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992722880L))
            info.setReturnValue("/@=8SbuLI\"9\u92EB']\u360Cc\u95B697|\u76DA|\u99AC;L+\u5D37?LX``U?v/F QJu,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2128521699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128521699L))
            info.setReturnValue(1193846240);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply_645541964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(645541964L))
            info.cancel();
    }


}
