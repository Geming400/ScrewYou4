package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagLoader.EntryWithSource.class)
public class EntryWithSource_796276890Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2113178148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113178148L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__339183582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339183582L))
            info.setReturnValue("\u303B\uB7E9#\u7E51g\u247BqfF'W1;>_lbxqOg|@AB+Vwo|Yj\"\u2269ng8!qx=?;\uFEC5=3uGj\u478C 3hGvN}W;4\"_,e&kn>K@Qbs$N\u765FV&fpf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_834539631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834539631L))
            info.setReturnValue(-783334064);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/lang/String;", cancellable = true)
    private void source__339183582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339183582L))
            info.setReturnValue("\u303B\uB7E9#\u7E51g\u247BqfF'W1;>_lbxqOg|@AB+Vwo|Yj\"\u2269ng8!qx=?;\uFEC5=3uGj\u478C 3hGvN}W;4\"_,e&kn>K@Qbs$N\u765FV&fpf");
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private void entry_748826499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748826499L))
            info.setReturnValue(null);
    }


}
