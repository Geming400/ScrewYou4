package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedPathElement.class)
public class IndexedPathElement_1581711832Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1619974077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974077L))
            info.setReturnValue(113575288);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_446251360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251360L))
            info.setReturnValue("$bvk!蒼wK_LX7/d\"Jy^)덄R2(|)$|SMc4蓏磵.<M썐.m|㬰룅lx9禮AAI軳 (9lwྌ9>%k乀.䓈utK徑9FXw|x>sO⨬BᲜ瓌Zr[Wk682蒥J");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1327743206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327743206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_446251856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251856L))
            info.setReturnValue(" tDשׂA(XwlpDFT)飖M\"칯pI﹠_%z孊呍zxIDಊ=2{k?V㼤hg鎬4BN⾈");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619974573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974573L))
            info.setReturnValue(1486359363);
    }


}
