package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Dictionary.class)
public class Dictionary_24649444Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Term;Lnet/minecraft/util/parsing/packrat/Rule$SimpleRuleAction;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void put_535716692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535716692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Rule;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void put__1235002846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235002846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forward(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void forward_62353420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62353420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "named(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void named__201394005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201394005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "namedWithAlias(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void namedWithAlias__58745696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58745696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/util/parsing/packrat/Atom;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void getOrThrow_62353420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62353420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putComplex(Lnet/minecraft/util/parsing/packrat/Atom;Lnet/minecraft/util/parsing/packrat/Term;Lnet/minecraft/util/parsing/packrat/Rule$RuleAction;)Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void putComplex_878677378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878677378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAllBound()V", cancellable = true)
    private void checkAllBound_62924182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(62924182L))
            info.cancel();
    }


}
