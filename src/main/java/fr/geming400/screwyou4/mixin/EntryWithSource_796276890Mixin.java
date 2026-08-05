package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.EntryWithSource.class)
public class EntryWithSource_796276890Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__112349379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112349379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1566699918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566699918L))
            info.setReturnValue("nro!fw Zl1HM\uD319N6&!\"\u365EPauB=f\u3291T`oO9\uA29D)daT%ulH\u983DC8sn^p)\uC393?xZp\u42A0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1353628980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353628980L))
            info.setReturnValue(-1427341906);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/lang/String;", cancellable = true)
    private void source_1674971645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674971645L))
            info.setReturnValue("9QuN>[w1zwh]`_X@||\u83AB;G\u6FFDjwa'F)8AzZwX\uCF97B<q*{PYr");
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private void entry_1636138321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636138321L))
            info.setReturnValue(null);
    }


}
