package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.AttributeModifier.OperationId.class)
public class OperationId1160255547Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/modifier/AttributeModifier$OperationId;", cancellable = true)
    private static void values_1946512635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946512635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/modifier/AttributeModifier$OperationId;", cancellable = true)
    private static void valueOf_326106946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326106946L))
            info.setReturnValue(net.minecraft.world.attribute.modifier.AttributeModifier.OperationId.OR);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1248464169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248464169L))
            info.setReturnValue("\u3F3D(<aNvOCfK7$r\u6F06}\uD7BCE%d\u19258k\u2BC58-YhI\uA322\uA7A8\u96FDu");
    }


}
