package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.ConstantValue.class)
public class ConstantValue1697898831Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__606775007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606775007L))
            info.setReturnValue(8.57854E7F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_789272563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789272563L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1826644940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826644940L))
            info.setReturnValue("<tv_79Aai4'i\u0339\uBAEF\u4C2D.Y\u3CD0r]%HH#eeo\uA1CBz\u5995|\u8109B[8&?W\u81491|gr4|!?&hX>OB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2039716374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039716374L))
            info.setReturnValue(-2006748529);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_1468428011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468428011L))
            info.setReturnValue(8.57854E7F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1530623211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530623211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(F)Lnet/minecraft/world/level/storage/loot/providers/number/ConstantValue;", cancellable = true)
    private static void exactly_98954466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98954466L))
            info.setReturnValue(null);
    }


}
