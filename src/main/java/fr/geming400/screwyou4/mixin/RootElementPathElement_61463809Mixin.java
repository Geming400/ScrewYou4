package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.RootElementPathElement.class)
public class RootElementPathElement_61463809Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__1073996663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073996663L))
            info.setReturnValue("-M\u013F/j?y2=/_Ye+E]q>.aSYw\u7901\u6D5CR");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1446976067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446976067L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1073996167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073996167L))
            info.setReturnValue("xKW.n)l\u3D760uXsyq&c7xM`Whk\u335C\u4137HeT#_OvcuC5z3\u4975&'K,%5PI+j\u95A8\uBEB07\u275DlS'|{\uCB4Cpe`K4@^[R\uA2BAv^Tt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_99726550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99726550L))
            info.setReturnValue(1340569524);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_869955121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869955121L))
            info.setReturnValue(null);
    }


}
