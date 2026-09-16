package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Repeated.class)
public class Repeated434484540Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__474141728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474141728L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1204908065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204908065L))
            info.setReturnValue("E5pt9<W\u32D4Q]d\u8EADmgqFo&3KEV&&v4QqP\u6077\u3E71+r*:h1uBD83\u69DEwl\u1667zcxB\uC390\uBB43U\u0EAD&^6\u12BEd,6+yD0m]A+kMP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_991836631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991836631L))
            info.setReturnValue(1397475046);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_230681703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230681703L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "element()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void element_804516844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804516844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minRepetitions()I", cancellable = true)
    private void minRepetitions_788681906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788681906L))
            info.setReturnValue(-351347474);
    }

    @Inject(at = @At("HEAD"), method = "listName()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void listName__1775286805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775286805L))
            info.setReturnValue(null);
    }


}
