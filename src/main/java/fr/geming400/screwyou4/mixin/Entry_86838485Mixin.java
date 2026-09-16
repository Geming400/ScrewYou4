package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.Entry.class)
public class Entry_86838485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__821787784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821787784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_857262009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857262009L))
            info.setReturnValue(".+w]}GLaSAbtsB\u50D44C5;|o\u7B27Q})>I[uKTj\u8BEC.:c/2i\u0D61/J\u9C408eY?g#\u7F44!w\u38E5M=4WSQ|R_D kIg\":S|AtJ1O6B>\u347B@=2P :mUYp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_644190575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644190575L))
            info.setReturnValue(241632983);
    }

    @Inject(at = @At("HEAD"), method = "argument()Ljava/lang/Object;", cancellable = true)
    private void argument_148968812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148968812L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/attribute/modifier/AttributeModifier;", cancellable = true)
    private void modifier_78495226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78495226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyModifier(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyModifier_1295313848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295313848L))
            info.setReturnValue(new java.lang.Object());
    }


}
