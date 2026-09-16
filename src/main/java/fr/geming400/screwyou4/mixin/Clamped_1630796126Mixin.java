package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Clamped.class)
public class Clamped_1630796126Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value__638055555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638055555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_722169857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722169857L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1893747646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893747646L))
            info.setReturnValue("\"\u89EAvpx \u05C2S9NKv,=\u15D184m=!UC=UvHU6^=i\u946D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2106819080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106819080L))
            info.setReturnValue(-48448246);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_209666286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209666286L))
            info.setReturnValue(9.565745E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_1985862940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985862940L))
            info.setReturnValue(9.565745E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1597725917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597725917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__776404129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776404129L))
            info.setReturnValue(9.565745E8F);
    }


}
