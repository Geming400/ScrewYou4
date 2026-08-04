package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.class)
public class ValidationContext_1774675544Mixin {
        @Inject(at = @At("HEAD"), method = "resolver()Lnet/minecraft/core/HolderGetter$Provider;", cancellable = true)
    private void resolver__1453741501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453741501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reporter()Lnet/minecraft/util/ProblemReporter;", cancellable = true)
    private void reporter__747216866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747216866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasVisitedElement(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void hasVisitedElement_1962348690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962348690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowsReferences()Z", cancellable = true)
    private void allowsReferences_1812954126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812954126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportProblem(Lnet/minecraft/util/ProblemReporter$Problem;)V", cancellable = true)
    private void reportProblem__87580137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87580137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enterElement(Lnet/minecraft/util/ProblemReporter$PathElement;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void enterElement_995032471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995032471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forIndexedField(Ljava/lang/String;I)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forIndexedField__1236231561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236231561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMapField(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forMapField__1293261262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293261262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forChild(Lnet/minecraft/util/ProblemReporter$PathElement;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forChild_1227524049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227524049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forField(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/ValidationContext;", cancellable = true)
    private void forField_1059306620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059306620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateContextUsage(Lnet/minecraft/world/level/storage/loot/LootContextUser;)V", cancellable = true)
    private void validateContextUsage_242208478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(242208478L))
            info.cancel();
    }


}
