package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BannerItem.class)
public class BannerItem_1840655093Mixin {
        @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1826321043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826321043L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GRAY);
    }


}
