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
            info.setReturnValue(-1655715405);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__503516387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503516387L))
            info.setReturnValue("m︨夢&䧵1k3/e=e%x21W统1鄂a6jl0p뫿l^屴憎gs/|u-2=BI椝F靄,h}%t)捿Gm贮QXsG*ٯ{rQ`쬷$춂|㤦䙥 <⋘}S;F<`),rKrIV4瀹鷘");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__503516387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503516387L))
            info.setReturnValue("m︨夢&䧵1k3/e=e%x21W统1鄂a6jl0p뫿l^屴憎gs/|u-2=BI椝F靄,h}%t)捿Gm贮QXsG*ٯ{rQ`쬷$춂|㤦䙥 <⋘}S;F<`),rKrIV4瀹鷘");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2017456343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017456343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__503515891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503515891L))
            info.setReturnValue(":䦳K;z%jqRSm;9鷺C8rgQKh濔겺6罬A*71-,@AKᬁuE#펺ZJf'l3Rﯘ1w^M<I`;Ds{;u{,뷎Y9B35ljo臭r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_670206826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670206826L))
            info.setReturnValue(-1858862824);
    }


}
