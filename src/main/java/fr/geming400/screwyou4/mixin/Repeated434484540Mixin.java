package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Repeated.class)
public class Repeated434484540Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1819996799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819996799L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__700975435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700975435L))
            info.setReturnValue("\u0565\u3E77O?8(S\uA7ADbh0Ng\u4364g/$$mI)\u3757Lgy\u54109e kw\u300CTW\uFBBFI.2*P\u11A4M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_472747282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472747282L))
            info.setReturnValue(-1636891298);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_813270388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813270388L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "element()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void element_1734544368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734544368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listName()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void listName_1750467476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750467476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minRepetitions()I", cancellable = true)
    private void minRepetitions_472746786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472746786L))
            info.setReturnValue(-1458367808);
    }


}
