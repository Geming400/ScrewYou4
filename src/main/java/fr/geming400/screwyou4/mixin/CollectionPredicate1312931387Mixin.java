package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionPredicate.class)
public class CollectionPredicate1312931387Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size_1558392809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558392809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1596523650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596523650L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_177471412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177471412L))
            info.setReturnValue("KptYW/J|8D㒑_V^}n,YNl}49;8stmPwjT\"?{2Po#zRVGYo1ﺐ&C9SD9bE[综iA#^^vsDpp3Kࠃ^NS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1351194129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351194129L))
            info.setReturnValue(2107667108);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1596395186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596395186L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__807107013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807107013L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains()Ljava/util/Optional;", cancellable = true)
    private void contains_1558392809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558392809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "counts()Ljava/util/Optional;", cancellable = true)
    private void counts_1558392809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558392809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1796609362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796609362L))
            info.setReturnValue(null);
    }


}
