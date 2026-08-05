package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Marker.class)
public class Marker511748476Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void name_1827731412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827731412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1924026601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924026601L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1897260735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897260735L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__623711499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623711499L))
            info.setReturnValue("2Qe︉圱ൿ<vP#|_VV&74:frRl9繸La掁VꡗG>RKt4NF+1G뤰J\"-jz73B{8,bhᎼ20.ꙙ刂?ﳒWBH㥗Npc(쿅#C0ᮿdewJX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_550011218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550011218L))
            info.setReturnValue(2018148862);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_890534324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890534324L))
            info.setReturnValue(true);
    }


}
