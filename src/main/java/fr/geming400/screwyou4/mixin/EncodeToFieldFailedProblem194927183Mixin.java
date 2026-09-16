package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToFieldFailedProblem.class)
public class EncodeToFieldFailedProblem194927183Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1004194339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004194339L))
            info.setReturnValue("/BM(o}0W\u67E1I\u39F3K\u3936U:\u750Fj}\u0252");
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__808593765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808593765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__713699085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713699085L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_965350708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965350708L))
            info.setReturnValue("AR>i\u56594Zb)5HF2t K0x4/|}4:[-#.}\uA201^!\u5835\u9DD5Od,]z\u5915\u586E,jYTnx` Z#X10@zZ?VjZu,B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_752279274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752279274L))
            info.setReturnValue(1977065839);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_2003635186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003635186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__979060524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979060524L))
            info.setReturnValue("\u2261'\u949C\u5008[e\u6898\uA30D)Odj%h|Xp\"32UfpKT1\u35D5X`Z\u2311\u440FV([}\u88B1VbSO0<p\uA3E9-+@mDx1,Y*oM\"(,6\uB70BYvE\"ymPv=u\"j*V?};:[<M7n");
    }


}
