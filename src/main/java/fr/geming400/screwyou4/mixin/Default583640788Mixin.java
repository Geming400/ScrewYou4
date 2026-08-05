package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Default.class)
public class Default583640788Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private void type_552704786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552704786L))
            info.setReturnValue(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.HIDDEN);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1969153047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969153047L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__551819187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551819187L))
            info.setReturnValue("/M#uO>Q䐊mvh'硃愒j*ISP@$\"\"`F⇞=-jvN`알k!RN]C{췭M#%a7M-g:j7[&&gB*FS;hV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_621903530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621903530L))
            info.setReturnValue(-917263884);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Consumer;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/Holder;Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void apply__899000103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-899000103L))
            info.cancel();
    }


}
