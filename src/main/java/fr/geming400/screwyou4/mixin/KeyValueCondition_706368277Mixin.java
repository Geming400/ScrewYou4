package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.class)
public class KeyValueCondition_706368277Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__202257992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202257992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1476791801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476791801L))
            info.setReturnValue("feJ%ej\uAB33x%XUo]|vp$7}{\u7D37tcdD0tTV0Oe?<AZZ91\u2080m]zOZS?g+O]{j\uA2A9NlPC\u3C43AA\u0487l_Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1263720367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263720367L))
            info.setReturnValue(587441815);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate_105613929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105613929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/Map;", cancellable = true)
    private void tests_1509541435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509541435L))
            info.setReturnValue(null);
    }


}
