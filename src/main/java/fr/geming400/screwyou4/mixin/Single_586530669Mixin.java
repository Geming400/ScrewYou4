package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Single.class)
public class Single_586530669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1972042927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972042927L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__548929307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548929307L))
            info.setReturnValue("d>Ptx:Ng\u9682tm\"Fyro9@\uFC46\u1167c\u5820A``=Rzfl16tv=j%ba.wy\uA36Ab[h-\uB8B0L2YCR\u7A478TVeW\u392Fq<tPfi\u8B17]%5$%t\u2EC0\u27E0GQne7?{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_624793410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624793410L))
            info.setReturnValue(-1902710019);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1972171391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972171391L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__1533507732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533507732L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/advancements/predicates/CollectionCountsPredicate$Entry;", cancellable = true)
    private void entry_1706555512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706555512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__2082099812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082099812L))
            info.setReturnValue(null);
    }


}
