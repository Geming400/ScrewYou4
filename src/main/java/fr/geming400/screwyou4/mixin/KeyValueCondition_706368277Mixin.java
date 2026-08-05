package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.class)
public class KeyValueCondition_706368277Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2091880535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091880535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__429091699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429091699L))
            info.setReturnValue("[x窍76#p(p'hZ+ac㶣aYm02gC!⃮⍿lB8z&D7&F?胙L1kAMfcꅲi@$|)ACkvsVg0Tฦ垟ଅ立[0豙N'M{ᶍxO_B0*t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_744631018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744631018L))
            info.setReturnValue(-346882018);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate__962297325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962297325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/Map;", cancellable = true)
    private void tests__1298255364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298255364L))
            info.setReturnValue(null);
    }


}
