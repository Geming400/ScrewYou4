package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.ConstantValue.class)
public class ConstantValue1697898831Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_1736158194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736158194L))
            info.setReturnValue(8.842305E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1211556206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211556206L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_562438856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562438856L))
            info.setReturnValue("cgZ琠STYkU+J>?(太/KgN@1RT&(J\"H{ry#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1736161573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736161573L))
            info.setReturnValue(-1804167982);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__679069487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679069487L))
            info.setReturnValue(8.842305E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__861214741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861214741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(F)Lnet/minecraft/world/level/storage/loot/providers/number/ConstantValue;", cancellable = true)
    private static void exactly__15300074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15300074L))
            info.setReturnValue(null);
    }


}
