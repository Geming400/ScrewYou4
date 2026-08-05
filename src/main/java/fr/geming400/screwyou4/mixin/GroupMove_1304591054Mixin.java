package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.GroupMove.class)
public class GroupMove_1304591054Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1604863984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604863984L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_169131078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169131078L))
            info.setReturnValue("^H1p,%]*WV!F7qVA,R蜿窾|\"fCU獚!#cVYZ8LN!%;C+t7`+q3PUnh2aQ9<3ᗭg;1KHX?z乥}U;sw]_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1342853795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342853795L))
            info.setReturnValue(-1972679196);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__481594126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481594126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fixers()Ljava/util/List;", cancellable = true)
    private void fixers__1364039427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364039427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromTo()Ljava/util/Map;", cancellable = true)
    private void fromTo__700032587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700032587L))
            info.setReturnValue(null);
    }


}
