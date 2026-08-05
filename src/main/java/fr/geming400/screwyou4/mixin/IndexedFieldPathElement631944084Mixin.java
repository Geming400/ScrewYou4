package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedFieldPathElement.class)
public class IndexedFieldPathElement631944084Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_670206330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670206330L))
            info.setReturnValue(-1683403605);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__503516387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503516387L))
            info.setReturnValue("m\uFE28\u5922&\u49F51k3/e=e%x21W\u7EDF1\u9102a6jl0p\uBAFFl^\u5C74\u618Egs/|u-2=BI\u691DF\u9744,h}%t)\u637FGm\u8D2EQXsG*\u066F{rQ`\uCB37$\uCD82|\u3926\u4665 <\u22D8}S;F<`),rKrIV4\u7039\u9DD8");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__503516387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503516387L))
            info.setReturnValue("m\uFE28\u5922&\u49F51k3/e=e%x21W\u7EDF1\u9102a6jl0p\uBAFFl^\u5C74\u618Egs/|u-2=BI\u691DF\u9744,h}%t)\u637FGm\u8D2EQXsG*\u066F{rQ`\uCB37$\uCD82|\u3926\u4665 <\u22D8}S;F<`),rKrIV4\u7039\u9DD8");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2017456343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017456343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__503515891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503515891L))
            info.setReturnValue(":\u49B3K;z%jqRSm;9\uF93AC8rgQKh\u6FD4\uACBA6\u7F6CA*71-,@AK\u1B01uE#\uD3BAZJf'l3R\uFBD81w^M<I`;Ds{;u{,\uBDCEY9B35ljo\u81EDr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_670206826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670206826L))
            info.setReturnValue(-1886551024);
    }


}
