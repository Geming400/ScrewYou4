package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Linear.class)
public class Linear1224695033Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base__644760725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644760725L))
            info.setReturnValue(8.250092E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_316068765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316068765L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1995118558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995118558L))
            info.setReturnValue("'3.!|p*_>7: C)\u535BgB_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1782047124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782047124L))
            info.setReturnValue(650753576);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2003827009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003827009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__1182505221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182505221L))
            info.setReturnValue(8.250092E8F);
    }

    @Inject(at = @At("HEAD"), method = "perLevelAboveFirst()F", cancellable = true)
    private void perLevelAboveFirst_1413462786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413462786L))
            info.setReturnValue(8.250092E8F);
    }


}
