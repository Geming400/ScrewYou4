package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Dictionary.class)
public class Dictionary_24649444Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Term;Lnet/minecraft/util/parsing/packrat/Rule$SimpleRuleAction;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void put__2057984477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057984477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Rule;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void put_1419705777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419705777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forward(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void forward_1822749223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822749223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAllBound()V", cancellable = true)
    private void checkAllBound__1240505551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1240505551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "namedWithAlias(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void namedWithAlias_345460879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345460879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "named(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void named_2139776804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139776804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void getOrThrow_88739167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88739167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putComplex(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Term;Lnet/minecraft/util/parsing/packrat/Rule$RuleAction;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void putComplex__913788637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913788637L))
            info.setReturnValue(null);
    }


}
