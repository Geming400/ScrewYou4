package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.StateDefinition.class)
public class StateDefinition506855062Mixin {
        @Inject(at = @At("HEAD"), method = "getProperty(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Property;", cancellable = true)
    private void getProperty_296192708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296192708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1277278091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277278091L))
            info.setReturnValue("\u5A65!u_yEj^)[k;mT\u2BFB'%CQ-O3@<wEzS\u8FC6\u7691\uA2D6<>R`\u9E573S\u3913cv\u39D9\uF94BnH(RRVB\u0C33#U*! 4Y*X#\u99A3a-aA7V#$BDc\uD6F7,\u7EC7\"3`ENm\u594Cao");
    }

    @Inject(at = @At("HEAD"), method = "getProperties()Ljava/util/Collection;", cancellable = true)
    private void getProperties__1691771153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691771153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Ljava/lang/Object;", cancellable = true)
    private void getOwner_221974894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221974894L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void any__1606770419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606770419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleStates()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void getPossibleStates__1194173870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194173870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSingletonState()Z", cancellable = true)
    private void isSingletonState__566539459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566539459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "propertiesCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void propertiesCodec__491894481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491894481L))
            info.setReturnValue(null);
    }


}
