package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.EnvironmentAttributeValue.class)
public class EnvironmentAttributeValue1895297162Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_986670894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986670894L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1629246609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629246609L))
            info.setReturnValue("TFIsy0M\u65BAs\u23CEJNZY\u8C03Kv#OOy[4@\uC80C]\u6A14;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1842318043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842318043L))
            info.setReturnValue(-397096055);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_1665826342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665826342L))
            info.setReturnValue(1.045747E8F);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/world/attribute/EnvironmentAttribute;", cancellable = true)
    private void attribute_1394567175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394567175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1620166906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620166906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1333224880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333224880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEnvironmentAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/level/storage/loot/providers/number/EnvironmentAttributeValue;", cancellable = true)
    private static void forEnvironmentAttribute_2063793968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063793968L))
            info.setReturnValue(null);
    }


}
