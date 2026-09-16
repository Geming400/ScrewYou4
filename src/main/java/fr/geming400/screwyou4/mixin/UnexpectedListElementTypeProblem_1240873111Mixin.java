package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedListElementTypeProblem.class)
public class UnexpectedListElementTypeProblem_1240873111Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1934989546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934989546L))
            info.setReturnValue(-1341392816);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2050140266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050140266L))
            info.setReturnValue("-\u6DD8\u06D1A)\")Z2%*B\u6CC9EPK\u1992c\uBF8ANRV.\"BM11yZe[qa8BV(|hU/iz5mI;&\u7DB89ZL6cdsEF+t_CU\u08825sdE%68?udl");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_332246842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332246842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2011296635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011296635L))
            info.setReturnValue("mv{?.1Q\uA189s%r\u5838\u1D4E&H ;WK>T\u8C86N:pV\uB176MSOn-5IJrjUwLwvG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1798225201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798225201L))
            info.setReturnValue(521970905);
    }

    @Inject(at = @At("HEAD"), method = "expected()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void expected_1376524401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376524401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual__1304110373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304110373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_66885403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66885403L))
            info.setReturnValue("DG_ $k_0Cy?B");
    }


}
