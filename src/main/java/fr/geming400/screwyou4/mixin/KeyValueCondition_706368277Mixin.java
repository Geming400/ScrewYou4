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
            info.setReturnValue("[x\u7A8D76#p(p'hZ+ac\u3DA3aYm02gC!\u20EE\u237FlB8z&D7&F?\u80D9L1kAMfc\uA172i@$|)ACkvsVg0T\u0E26\u579F\u0B05\u7ACB[0\u8C59N'M{\u1D8DxO_B0*t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_744631018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744631018L))
            info.setReturnValue(-827910118);
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
