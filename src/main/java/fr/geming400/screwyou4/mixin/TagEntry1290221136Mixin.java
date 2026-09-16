package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagEntry.class)
public class TagEntry1290221136Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2060644165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060644165L))
            info.setReturnValue("h{\"IfQrK /|\u9EBF\uBC91|S(v3|-\uC3FB|oA@\u6000KNb\u33C99H-](#V84E|hzM6By\u127F3|_\u33D6L");
    }

    @Inject(at = @At("HEAD"), method = "element(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void element__879366850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879366850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/tags/TagEntry$Lookup;Ljava/util/function/Consumer;)Z", cancellable = true)
    private void build_2020170900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020170900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void tag__233377952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233377952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verifyIfPresent(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void verifyIfPresent_1946886944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946886944L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "visitOptionalDependencies(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitOptionalDependencies_179472449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179472449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "optionalTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void optionalTag__1959903520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959903520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitRequiredDependencies(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitRequiredDependencies_2013319744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2013319744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "optionalElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void optionalElement_1635351742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635351742L))
            info.setReturnValue(null);
    }


}
