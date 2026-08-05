package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagEntry.class)
public class TagEntry1290221136Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_154760665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154760665L))
            info.setReturnValue("0.泍c(z87!Yhs3wZD=Pml*(Nm'}. :꘏ZYd9{'Nᓈdsdp3ﶉ-.snY跘nnj?5(8Nꅧ+fKr+?鼾烜|JsU0癈嵹HkeRP%꿛-oVh]");
    }

    @Inject(at = @At("HEAD"), method = "element(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void element__228118854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228118854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/tags/TagEntry$Lookup;Ljava/util/function/Consumer;)Z", cancellable = true)
    private void build_1101205670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101205670L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void tag__228118854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228118854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verifyIfPresent(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void verifyIfPresent_1155790565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155790565L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "optionalElement(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void optionalElement__228118854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228118854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitOptionalDependencies(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitOptionalDependencies_1971237549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1971237549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "optionalTag(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagEntry;", cancellable = true)
    private static void optionalTag__228118854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228118854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitRequiredDependencies(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitRequiredDependencies_1971237549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1971237549L))
            info.cancel();
    }


}
