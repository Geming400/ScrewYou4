package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemAttributeModifiers.Display.Type.class)
public class Type_390748905Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private static void values__1882088617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882088617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/ItemAttributeModifiers$Display$Type;", cancellable = true)
    private static void valueOf__162642732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162642732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__744711567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744711567L))
            info.setReturnValue(null);
    }


}
